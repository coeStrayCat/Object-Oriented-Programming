# Makefile สำหรับ Java Project - Class Example
# ใช้งาน: make compile, make run, make run-static, make clean, make all

# ตัวแปร
JAVA_FILES = *.java
MAIN_CLASS = Main
STATIC_CLASS = StaticDemo

# Default target
all: compile run

# คอมไฟล์ไฟล์ Java ทั้งหมด
compile:
	javac $(JAVA_FILES)

# รันโปรแกรม
run:	
	java $(MAIN_CLASS)

# รันโปรแกรม Static Demo
run-static:
	java $(STATIC_CLASS)
	
# ลบไฟล์ .class ทั้งหมด
clean:
	rm -f *.class

