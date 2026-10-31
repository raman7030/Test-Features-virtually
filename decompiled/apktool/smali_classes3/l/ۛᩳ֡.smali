.class public final Ll/ۛᩳ֡;
.super Ll/ܳܿ֡;
.source "P5T3"


# instance fields
.field public ۤ:Ljava/lang/String;

.field public ۫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۬ᩳ֡;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Ll/ܳܿ֡;-><init>(Ll/ۨᩳ֡;)V

    .line 47
    iput-object p2, p0, Ll/ۛᩳ֡;->ۤ:Ljava/lang/String;

    .line 48
    iput-object p3, p0, Ll/ۛᩳ֡;->۫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FailedPredicateException("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۛᩳ֡;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛᩳ֡;->۫:Ljava/lang/String;

    const-string v2, "}?)"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
