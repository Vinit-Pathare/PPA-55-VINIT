#include<stdio.h>
// #include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd =0;
    char arr[]="marvellous infosystems";


    fd = open("Hello.txt",O_RDWR | O_APPEND);
    if (fd == -1)
    {
        printf("unable to OPEN the file \n");
        return -1;
    }
    else
    {
        printf("file gets OPNED fd : %d\n",fd);
        write(fd,arr,10);

        close(fd);
    }

    return 0;
}

