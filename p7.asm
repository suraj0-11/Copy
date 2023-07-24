start

mov r8,#4

Idr r2,-cvalue

Idr r3,-dvalue

Idr r1.[12].#4

loop0

str r1.[3], #4 subs r8.r8,#1

cmp r8,#0

bne loop0 mov r5,#3

mov г7,#0

ldr r1,=dvalue

start1

Idr r2.[1],#4

Idr r3,[r1]

loop

cmp r2.r3

blt loop2 str r2, [r1],#-4

str r3,[r1]

mov r7,#1

add r1,#4

subs r5,15,#1

cmp r5,#0

loop2

bne loop

cmp r7,40

bne start1

XSS cvalue

b xss DCD

0X44444444 DCD OX11111111

dvalue

end

Mark first instruction to execute

:Initialize counter to 4(i.e. N-4)

Address of data region loop0)

:Loading values from code region

DCD 0X33333333 DCD 0X2222222

area datal,data,readwrite

DCD 0x00000000
