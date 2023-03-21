.model small
.stack 100h
.data
    n1 db 'First Input:$'
    n2 db 10,13,'Second Input:$'  
    n3 db 10,13,'The sum is:$'                                            
.code
    mov ax,@data
    mov ds,ax
    
    mov ah,09h          ;1st Input Display 
    mov dx,offset n1   
    int 21h
    
    mov ah,01h          ;Tens Input
    int 21h
    sub al,30h
    mov bh,al           
    
    mov ah,01h          ;Ones Input
    int 21h
    sub al,30h
    mov ch,al           
    
    mov ah,09h          ;2nd Input Display
    mov dx,offset n2
    int 21h
    
    mov ah,01h          ;Ones Input
    int 21h
    sub al,30h
    mov dh,al           
    
    mov ax,0            ;Add Ones
    mov al,ch
    add al,dh           
    
    aaa
    
    mov bl,ah           ;Tens Place
    mov cl,al           ;Ones Place
    
    add bl,30h
    add cl,30h
    
    mov ax,0            ;Add Tens
    mov al,bh
    add al,bl           
    
    aaa
              
    mov bl,ah           ;Hundreds Place
    mov ch,al           ;Tens Place
    
    add bl,30h
    add ch,30h
    
    mov ah,09h          ;Sum Display
    mov dx,offset n3                        
    int 21h
    
    mov ah,02h          ;Request to Display
    mov dl,bl           ;Hundreds
    int 21h
    
    mov dl,ch           ;Tens
    int 21h
    
    mov dl,cl           ;Ones
    int 21h
    
mov ah,4ch
int 21h
end