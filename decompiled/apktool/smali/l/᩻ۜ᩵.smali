.class public final Ll/᩻ۜ᩵;
.super Ll/ۡۜ᩵;
.source "K6PM"

# interfaces
.implements Ljava/util/concurrent/RunnableFuture;


# static fields
.field public static final serialVersionUID:J = 0x489d6925990d6e4eL


# instance fields
.field public final ۛ:Ljava/lang/Runnable;

.field public ۤ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 0

    .line 856
    invoke-direct {p0}, Ll/ۡۜ᩵;-><init>()V

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    iput-object p1, p0, Ll/᩻ۜ᩵;->ۛ:Ljava/lang/Runnable;

    .line 858
    iput-object p2, p0, Ll/᩻ۜ᩵;->ۤ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 865
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[Wrapped task = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻ۜ᩵;->ۛ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 862
    iget-object v0, p0, Ll/᩻ۜ᩵;->ۛ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 860
    iget-object v0, p0, Ll/᩻ۜ᩵;->ۤ:Ljava/lang/Object;

    return-object v0
.end method
