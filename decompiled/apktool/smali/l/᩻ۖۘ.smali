.class public Ll/᩻ۖۘ;
.super Ll/ۛܺۘ;
.source "C7YA"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ll/ۛܺۘ;-><init>()V

    const/16 v0, 0x20

    .line 32
    iput v0, p0, Ll/ۛܺۘ;->ۧ:I

    const-string v0, "HmacSHA256"

    .line 33
    iput-object v0, p0, Ll/ۛܺۘ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getBlockSize()I
    .locals 1

    .line 45
    iget v0, p0, Ll/ۛܺۘ;->ۧ:I

    return v0
.end method

.method public final ֫()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Ll/ۛܺۘ;->ܽ:Z

    return v0
.end method
