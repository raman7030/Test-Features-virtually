.class public final Ll/ܰ᩻ۢ;
.super Ll/ܰۨᩳ;
.source "51KR"


# instance fields
.field public final synthetic ܽ:Ll/ܽۜۢ;


# direct methods
.method public constructor <init>(Ll/ܽۜۢ;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 285
    iput-object p1, p0, Ll/ܰ᩻ۢ;->ܽ:Ll/ܽۜۢ;

    return-void
.end method


# virtual methods
.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 289
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰ᩻ۢ;->ܽ:Ll/ܽۜۢ;

    invoke-virtual {v1}, Ll/ܽۜۢ;->֨()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܳۛۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".java"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
