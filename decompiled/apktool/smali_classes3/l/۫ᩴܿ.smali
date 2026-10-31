.class public final Ll/۫ᩴܿ;
.super Ljava/io/IOException;
.source "T7HQ"


# instance fields
.field public final ᩸:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/io/IOException;)V
    .locals 1

    .line 11
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    iput-object p1, p0, Ll/۫ᩴܿ;->᩸:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/io/IOException;)V
    .locals 2

    .line 22
    instance-of v0, p0, Ll/ۨᩴܿ;

    if-nez v0, :cond_0

    instance-of v0, p0, Ll/۬۠ܿ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "Permission denied"

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "EACCES"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    .line 17
    :cond_2
    new-instance v0, Ll/۫ᩴܿ;

    invoke-direct {v0, p0, p1}, Ll/۫ᩴܿ;-><init>(Ll/ܶ᩵ܿ;Ljava/io/IOException;)V

    throw v0
.end method


# virtual methods
.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/۫ᩴܿ;->᩸:Ll/ܶ᩵ܿ;

    return-object v0
.end method
