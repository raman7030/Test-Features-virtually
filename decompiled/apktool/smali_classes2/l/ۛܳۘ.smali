.class public final Ll/ۛܳۘ;
.super Ljava/lang/Object;
.source "N1MQ"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public ܿ:Ll/ۛܳۘ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 225
    iput p1, p0, Ll/ۛܳۘ;->ܽ:I

    .line 226
    iput p2, p0, Ll/ۛܳۘ;->ᩳ:I

    .line 227
    iput p4, p0, Ll/ۛܳۘ;->ۧ:I

    .line 228
    iput p3, p0, Ll/ۛܳۘ;->֫:I

    const/4 p1, 0x0

    .line 229
    iput-object p1, p0, Ll/ۛܳۘ;->ܿ:Ll/ۛܳۘ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "change[inserted="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۛܳۘ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deleted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۛܳۘ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", line0="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۛܳۘ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", line1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۛܳۘ;->ᩳ:I

    const-string v2, "]"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
