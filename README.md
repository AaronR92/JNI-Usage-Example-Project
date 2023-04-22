### Compilation
1. Create header file ``javac -h <Where to> <File to>``
2. Compile .cpp file ``g++ -c -I"C:\Program Files\Java\jdk-18.0.2.1\include" -I"C:\Program Files\Java\jdk-18.0.2.1\include\win32" io_github_aaronr92_Main.cpp -o io_github_aaronr92_Main.o``
3. Create .dll file ``g++ -shared -o native.dll io_github_aaronr92_Main.o -Wl,--add-stdcall-alias``
