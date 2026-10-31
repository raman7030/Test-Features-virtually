.class public final Ll/ۧܳ֡;
.super Ll/ۛܿ֡;
.source "WAV3"


# static fields
.field public static final ֫:Ll/ۧܳ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Ll/ۧܳ֡;

    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    sput-object v0, Ll/ۧܳ֡;->֫:Ll/ۧܳ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴܳ֡;Ljava/lang/Object;IILjava/lang/String;Ll/ۖܳ֡;)V
    .locals 1

    .line 38
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string p2, ":"

    const-string p6, " "

    const-string v0, "line "

    .line 0
    invoke-static {v0, p3, p2, p6, p4}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 38
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method
