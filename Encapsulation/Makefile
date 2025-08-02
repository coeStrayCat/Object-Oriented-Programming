# Makefile สำหรับ Java Project - Encapsulation Example
# ใช้งาน: make compile, make run, make clean, make all

# ตัวแปร
JAVA_FILES = *.java
MAIN_CLASS = Main
BUILD_DIR = build

# Default target
all: compile run

# คอมไฟล์ไฟล์ Java ทั้งหมด
compile:
	javac $(JAVA_FILES)

# รันโปรแกรม
run:	
	java $(MAIN_CLASS)
	
# ลบไฟล์ .class ทั้งหมด
clean:
	rm -f *.class

