.class public final Ll/ۢۧۢ;
.super Ljava/lang/Object;
.source "0BM3"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/lang/String;

.field public ܽ:I

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 350
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 375
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۢۧۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 369
    iget v0, p0, Ll/ۢۧۢ;->֫:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 365
    iget v0, p0, Ll/ۢۧۢ;->ܽ:I

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 361
    iget-object v0, p0, Ll/ۢۧۢ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method
