.model small    ;directive
.stack 100h     ;directive
.code
    
    mov ah, 02h
    
    mov dl,073   ;Letter I
    int 21h
    
    mov dl,110   ;Letter n
    int 21h
    
    mov dl,112   ;Letter p
    int 21h
    
    mov dl,117   ;Letter u
    int 21h
    
    mov dl,116   ;Letter t
    int 21h
    
    mov dl,032   ;Space
    int 21h
    
    mov dl,049   ;Number 1
    int 21h
    
    mov dl,058   ; :
    int 21h 
    
    mov dl,032   ;Space
    int 21h
    
    mov ah, 01h ;input1
    int 21h
    mov cl,al
    
    mov ah,02h
    mov dl,20   ;output 1
    mov dh,8
    mov bh,0
    int 10h
    
    mov ah,02h  ;Display 1
    mov dl,cl
    int 21h
    
    mov ah,02h  ;gotoxy input 2
    mov dl,0    
    mov dh,1
    mov bh,0
    int 10h
    
    mov dl,073   ;Letter I
    int 21h
    
    mov dl,110   ;Letter n
    int 21h
    
    mov dl,112   ;Letter p
    int 21h
    
    mov dl,117   ;Letter u
    int 21h
    
    mov dl,116   ;Letter t
    int 21h
    
    mov dl,032   ;Space
    int 21h
    
    mov dl,050   ;Number 2
    int 21h
    
    mov dl,058   ; :
    int 21h 
    
    mov dl,032   ;Space
    int 21h
          
    mov ah, 01h ;input2
    int 21h
    mov cl,al
    
    mov ah,02h  ;output 2
    mov dl,40    
    mov dh,8
    mov bh,0
    int 10h
    
    mov ah,02h  ;Diplay 2
    mov dl,cl
    int 21h
    
    mov ah,02h  ;gotoxy input 3
    mov dl,0    
    mov dh,2
    mov bh,0
    int 10h
    
    
    mov dl,073   ;Letter I
    int 21h
    
    mov dl,110   ;Letter n
    int 21h
    
    mov dl,112   ;Letter p
    int 21h
    
    mov dl,117   ;Letter u
    int 21h
    
    mov dl,116   ;Letter t
    int 21h
    
    mov dl,032   ;Space
    int 21h
    
    mov dl,051   ;Number 3
    int 21h
    
    mov dl,058   ; :
    int 21h 
    
    mov dl,032   ;Space
    int 21h
    
    mov ah, 01h ;input3
    int 21h
    mov cl, al 
    
    mov ah,02h  ;gotoxy output 3
    mov dl,20    
    mov dh,15
    mov bh,0
    int 10h
    
    mov ah,02h  ;Diplay 3
    mov dl,cl
    int 21h 
    
    mov ah,02h  ;gotoxy input 4
    mov dl,0    
    mov dh,3
    mov bh,0
    int 10h
    
    mov dl,073   ;Letter I
    int 21h
    
    mov dl,110   ;Letter n
    int 21h
    
    mov dl,112   ;Letter p
    int 21h
    
    mov dl,117   ;Letter u
    int 21h
    
    mov dl,116   ;Letter t
    int 21h
    
    mov dl,032   ;Space
    int 21h
    
    mov dl,052   ;Number 4
    int 21h
    
    mov dl,058   ; :
    int 21h 
    
    mov dl,032   ;Space
    int 21h
    
    
    mov ah, 01h ;input4
    int 21h
    mov cl,al 
    
    mov ah,02h  ;gotoxy output 4
    mov dl,40    
    mov dh,15
    mov bh,0
    int 10h
    
    mov ah,02h  ;output 4
    mov dl,cl
    int 21h
    
    mov ah,02h  ;gotoxy output
    mov dl,0    
    mov dh,5
    mov bh,0
    int 10h
    
    mov ah,02h  ;O
    mov dl,079
    int 21h
    
    mov ah,02h  ;u
    mov dl,117
    int 21h
    
    mov ah,02h  ;t
    mov dl,116
    int 21h
    
    mov ah,02h  ;p
    mov dl,112
    int 21h
    
    mov ah,02h  ;u
    mov dl,117
    int 21h
    
    mov ah,02h  ;t
    mov dl,116
    int 21h
    
    mov ah,02h
    mov dl,058  ; :
    int 21h
    
    mov ah,02h
    mov dl,18  ;gotoxy lcorner,hline,rcorner
    mov dh,7
    mov bh,0
    int 10h
    
    call lcorner
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call rcorner
    
    mov ah,02h
    mov dl,18      ;gotoxy vline
    mov dh,8
    mov bh,0
    int 10h
    
    call vline
    call vline
    call vline
    call vline
    call vline
    call vline
    call vline
    call vline
    call llcorner
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline
    call hline

    mov dl,41       ;gotoxy vline
    mov dh,8
    mov bh,0
    int 10h
    
    call vline
    call vline
    call vline
    call vline
    call vline
    call vline
    call vline
    call vline
    call lrcorner
     
    mov ah,4ch
    int 21h
        
    hline:
    mov ah, 02h       ;horizontal line
    mov dl, 196
    int 21h
    ret
    
    lcorner:
    mov ah, 02h           ;left corner
    mov dl, 218
    int 21h
    ret
    
    rcorner:
    mov ah, 02h          ;right corner
    mov dl, 191
    int 21h
    ret
    
    llcorner:
    mov ah, 02h        ;lower left corner
    mov dl, 192
    int 21h
    ret
       
    lrcorner:
    mov ah, 02h        ;lower right corner
    mov dl, 217
    int 21h
    ret
        
    vline:
    mov ah, 02h        ; vertical line
    mov dl, 179
    int 21h  
      
    mov ah,02h  ;new line
    mov dl,010
    int 21h
    
    mov ah,02h  ;cret
    mov dl,008
    int 21h
    
    ret
              
end