.class public final Ll/ܰܿۡ;
.super Ljava/lang/Object;
.source "TBJG"


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public ܽ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput v0, p0, Ll/ܰܿۡ;->֫:I

    .line 47
    iput-boolean v0, p0, Ll/ܰܿۡ;->ۧ:Z

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/ܰܿۡ;->ܽ:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰܿۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܰܿۡ;->֫:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ܰܿۡ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܰܿۡ;->֫:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰܿۡ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܰܿۡ;->ۧ:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܰܿۡ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܰܿۡ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰܿۡ;->ܽ:Ljava/lang/StringBuilder;

    return-object p0
.end method
