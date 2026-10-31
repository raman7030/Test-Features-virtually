.class public final Ll/ᩳ᩵ܿ;
.super Ljava/lang/Object;
.source "01UY"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 341
    iput p1, p0, Ll/ᩳ᩵ܿ;->ۧ:I

    .line 342
    iput p2, p0, Ll/ᩳ᩵ܿ;->ܽ:I

    .line 343
    iput p3, p0, Ll/ᩳ᩵ܿ;->֫:I

    return-void
.end method

.method public constructor <init>(Ll/ܿ᩹ܿ;)V
    .locals 2

    .line 337
    invoke-virtual {p1}, Ll/ܿ᩹ܿ;->᩻()I

    move-result v0

    invoke-virtual {p1}, Ll/ܿ᩹ܿ;->ۡ()I

    move-result v1

    invoke-virtual {p1}, Ll/ܿ᩹ܿ;->֫()I

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Ll/ᩳ᩵ܿ;-><init>(III)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 351
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State{permissions="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ᩳ᩵ܿ;->ۧ:I

    .line 352
    invoke-static {v1}, Ljava/lang/Integer;->toOctalString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩳ᩵ܿ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", gid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩳ᩵ܿ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
