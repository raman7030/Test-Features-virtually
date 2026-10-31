.class public final Ll/᩵᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p2, p0, Ll/᩵᩹ۘ;->ܽ:Ljava/lang/String;

    .line 31
    iput p1, p0, Ll/᩵᩹ۘ;->֫:I

    .line 32
    iput-object p3, p0, Ll/᩵᩹ۘ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "errorCode: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩵᩹ۘ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", errorMsg: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵᩹ۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", errorDetail: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
