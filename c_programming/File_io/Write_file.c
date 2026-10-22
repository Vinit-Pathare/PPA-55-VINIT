#include<stdio.h>
// #include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd =0;
    fd = open("Hello.txt",O_RDWR);
    if (fd == -1)
    {
        printf("unable to OPEN the file \n");
        return -1;
    }
    else
    {
        printf("file gets OPNED fd : %d\n",fd);
        write(fd,"jay ganesh...",13);

        close(fd);
    }

    return 0;
}

