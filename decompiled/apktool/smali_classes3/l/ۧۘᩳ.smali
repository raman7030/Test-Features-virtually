.class public final Ll/ۧۘᩳ;
.super Ljava/lang/Object;
.source "WAJF"


# direct methods
.method public static ֫(Ljava/lang/String;)[B
    .locals 7

    .line 66
    invoke-static {p0}, Ll/ۗܳܳ;->֫(Ljava/lang/String;)[B

    move-result-object p0

    .line 20
    new-instance v0, Ll/᩻ܿܺ;

    invoke-direct {v0}, Ll/᩻ܿܺ;-><init>()V

    .line 21
    new-instance v1, Ll/ܺܿܺ;

    .line 26
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 70
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    iput-object v2, v1, Ll/ܺܿܺ;->ܿ:Ljava/io/PrintStream;

    const/4 v2, 0x0

    .line 23
    iput-boolean v2, v1, Ll/ܺܿܺ;->ᩳ:Z

    const/4 v2, 0x1

    .line 24
    iput-boolean v2, v1, Ll/ܺܿܺ;->ۧ:Z

    .line 25
    new-instance v3, Ll/ۢܿܺ;

    invoke-direct {v3}, Ll/ۢܿܺ;-><init>()V

    .line 26
    iput-boolean v2, v3, Ll/ۢܿܺ;->֫:Z

    .line 68
    iput-boolean v2, v1, Ll/ܺܿܺ;->ܽ:Z

    .line 69
    iput-boolean v2, v1, Ll/ܺܿܺ;->֫:Z

    const/16 v2, 0x1c

    .line 70
    iput v2, v3, Ll/ۢܿܺ;->ܽ:I

    .line 39
    new-instance v2, Ll/֫ۜܺ;

    invoke-direct {v2, v3}, Ll/֫ۜܺ;-><init>(Ll/ۢܿܺ;)V

    .line 31
    new-instance v4, Ll/᩹ᩳܺ;

    iget-boolean v5, v1, Ll/ܺܿܺ;->ᩳ:Z

    const-string v6, "jasm"

    invoke-direct {v4, v6, v5, p0}, Ll/᩹ᩳܺ;-><init>(Ljava/lang/String;Z[B)V

    .line 32
    invoke-virtual {v4}, Ll/᩹ᩳܺ;->ۘ()V

    .line 33
    invoke-virtual {v4}, Ll/᩹ᩳܺ;->᩷()V

    .line 34
    invoke-static {v0, v4, v1, v3, v2}, Ll/ۖܿܺ;->֫(Ll/᩻ܿܺ;Ll/᩹ᩳܺ;Ll/ܺܿܺ;Ll/ۢܿܺ;Ll/֫ۜܺ;)Ll/ۗ᩻ܺ;

    move-result-object p0

    .line 35
    invoke-virtual {v2, p0}, Ll/֫ۜܺ;->֫(Ll/ۗ᩻ܺ;)V

    .line 41
    invoke-virtual {v2}, Ll/֫ۜܺ;->֨()[B

    move-result-object p0

    return-object p0
.end method
