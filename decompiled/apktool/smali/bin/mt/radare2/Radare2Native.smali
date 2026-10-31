.class public final Lbin/mt/radare2/Radare2Native;
.super Ljava/lang/Object;
.source "Radare2Native.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native nativeAnalyzeFunctionCfg(Ljava/lang/String;JZLjava/lang/String;IIII)Ljava/lang/String;
.end method

.method public static native nativeAssemble(Ljava/lang/String;IJLjava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeCloseElfSearchSession(J)V
.end method

.method public static native nativeDisassemble(Ljava/lang/String;IJ[BI)Ljava/lang/String;
.end method

.method public static native nativeFindXrefs(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JZIIJIIII)Ljava/lang/String;
.end method

.method public static native nativeInspectElfFile(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeInspectElfSummary(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeMapAddress(Ljava/lang/String;JZZ)Ljava/lang/String;
.end method

.method public static native nativeOpenElfSearchSession(Ljava/lang/String;Z)J
.end method

.method public static native nativeReadElfItems(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIII)Ljava/lang/String;
.end method

.method public static native nativeReadElfSearchSessionItems(JLjava/lang/String;Ljava/lang/String;ZIII)Ljava/lang/String;
.end method

.method public static native nativeReadElfSearchSessionStrings(JIIIJ)Ljava/lang/String;
.end method

.method public static native nativeReadElfStrings(Ljava/lang/String;III)Ljava/lang/String;
.end method

.method public static native nativeVersion()Ljava/lang/String;
.end method
