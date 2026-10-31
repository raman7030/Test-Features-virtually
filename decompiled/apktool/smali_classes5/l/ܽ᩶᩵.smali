.class public abstract Ll/ܽ᩶᩵;
.super Ljava/lang/Object;
.source "0AWR"

# interfaces
.implements Ll/۟᩹᩵;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ܽ᩶᩵;->᩸:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 11
    invoke-static {p0}, Ll/ۜ᩶᩵;->֫(Ll/ܽ᩶᩵;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ܳ()I
    .locals 1

    .line 10
    iget v0, p0, Ll/ܽ᩶᩵;->᩸:I

    return v0
.end method
