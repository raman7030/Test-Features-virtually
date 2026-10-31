.class public final Ll/֫ۛ᩵;
.super Ljava/lang/Object;
.source "JAW9"

# interfaces
.implements Ll/ۨۗ᩵;


# instance fields
.field public final ᩸:Ll/ܳ᩸᩵;


# direct methods
.method public constructor <init>(Ll/ܳ᩸᩵;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/֫ۛ᩵;->᩸:Ll/ܳ᩸᩵;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CoroutineScope(coroutineContext="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    iget-object v1, p0, Ll/֫ۛ᩵;->᩸:Ll/ܳ᩸᩵;

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ܳ᩸᩵;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/֫ۛ᩵;->᩸:Ll/ܳ᩸᩵;

    return-object v0
.end method
