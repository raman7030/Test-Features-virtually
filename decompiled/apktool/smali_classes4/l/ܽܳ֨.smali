.class public final Ll/ܽܳ֨;
.super Ll/ۡܳ֨;
.source "34PY"


# instance fields
.field public final ֫:Ll/ۡܳ֨;


# direct methods
.method public constructor <init>(Ll/ۡܳ֨;)V
    .locals 0

    .line 129
    invoke-direct {p0}, Ll/ۡܳ֨;-><init>()V

    .line 130
    iput-object p1, p0, Ll/ܽܳ֨;->֫:Ll/ۡܳ֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܽܳ֨;->֫:Ll/ۡܳ֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "[]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
