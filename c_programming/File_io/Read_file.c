#include<stdio.h>
// #include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd =0;
    char arr[20] = {'\0'};


    fd = open("Hello.txt",O_RDONLY);
    if (fd == -1)
    {
        printf("unable to OPEN the file \n");
        return -1;
    }
    else
    {
        printf("file gets OPNED fd : %d\n",fd);
        read(fd,arr,13);

        printf("data from file is : %s\n");

        close(fd);
    }

    return 0;
}

