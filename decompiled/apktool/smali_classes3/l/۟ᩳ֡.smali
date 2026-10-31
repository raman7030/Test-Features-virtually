.class public Ll/۟ᩳ֡;
.super Ll/ܳܿ֡;
.source "667N"


# instance fields
.field public ۫:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ll/ܳܿ֡;-><init>()V

    const/4 v0, 0x0

    .line 32
    iput v0, p0, Ll/۟ᩳ֡;->۫:I

    return-void
.end method

.method public constructor <init>(ILl/ۨᩳ֡;)V
    .locals 0

    .line 38
    invoke-direct {p0, p2}, Ll/ܳܿ֡;-><init>(Ll/ۨᩳ֡;)V

    .line 39
    iput p1, p0, Ll/۟ᩳ֡;->۫:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MismatchedTokenException("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܳܿ֡;->֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "!="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۟ᩳ֡;->۫:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
