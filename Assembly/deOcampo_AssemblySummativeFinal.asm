.model small
.stack 100h
.data
    n1 db 'First Input:$'
    n2 db 10,13,'Second Input:$'  
    n3 db 10,13,'The sum is:$'                                            
.code
    
    ;User Input
    
    mov ax,@data
    mov ds,ax
    
    mov ah,09h          ;1st Input Display 
    mov dx,offset n1   
    int 21h
    
    mov ah,01h          ;Tens Input                     BH
    int 21h
    sub al,30h
    mov bh,al           
    
    mov ah,01h          ;Ones Input                     BL
    int 21h
    sub al,30h
    mov bl,al           
    
    mov ah,09h          ;2nd Input Display
    mov dx,offset n2
    int 21h
    
    mov ah,01h          ;Tens Input                     CH
    int 21h
    sub al,30h
    mov ch,al
    
    mov ah,01h          ;Ones Input                     CL
    int 21h
    sub al,30h
    mov cl,al           
    
    ;Adding BL and CL
    
    mov ax,0            
    mov al,bl
    add al,cl           
    
    aaa
    
    mov bl,ah           ;Carry                     
    mov cl,al           ;Ones Place                     
    
    add bl,30h
    add cl,30h
    
    ;Adding BH and BL(Carry)
    
    mov ax,0            
    mov al,bh
    add al,bl           
    
    aaa
              
    mov bh,ah           ;Carry                 
    mov dh,al           ;Tens Place                     
    
    add bh,30h
    add bl,30h
    
    ;Adding BL(Carry) and CH
    
    mov ax,0
    mov al,dh
    add al,ch
    
    aaa
    
    mov ch,ah           
    mov bl,al           ;Overwrite Tens Place
    
    add ch,30h
    add bl,30h
    
    ;Adding BH and CH
    
    mov ax,0
    mov al,bh
    add al,ch
    
    aaa
    
    mov bh,ah           ;0 Carry
    mov ch,al           ;Hundreds Place
    
    add bh,30h
    add ch,30h
    
    ;Result
    
    mov ah,09h          ;Sum Display
    mov dx,offset n3                        
    int 21h
    
    mov ah,02h          ;Request to Display
    mov dl,ch           ;Hundreds                       CH
    int 21h
    
    mov dl,bl           ;Tens                           BL
    int 21h
    
    mov dl,cl           ;Ones                           CL
    int 21h
    
    ;de Ocampo, Gerson T.
    
mov ah,4ch
int 21h
end