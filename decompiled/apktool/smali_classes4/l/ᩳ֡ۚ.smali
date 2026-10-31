.class public final Ll/ᩳ֡ۚ;
.super Ljava/lang/Object;
.source "MAUA"


# static fields
.field public static final ֫:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(?i)\\bcharset=\\s*(?:[\"\'])?([^\\s,;\"\']*)"

    .line 43
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    const-string v0, "UTF-8"

    .line 44
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ll/ᩳ֡ۚ;->֫:Ljava/nio/charset/Charset;

    .line 45
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    return-void
.end method
