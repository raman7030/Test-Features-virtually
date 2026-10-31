.class public abstract Ll/֫᩶;
.super Ljava/lang/Object;
.source "268P"


# instance fields
.field public final ֫:Landroid/content/ComponentName;

.field public ۧ:Z

.field public ܽ:I


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p1, p0, Ll/֫᩶;->֫:Landroid/content/ComponentName;

    return-void
.end method


# virtual methods
.method public ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(I)V
    .locals 3

    .line 127
    iget-boolean v0, p0, Ll/֫᩶;->ۧ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 128
    iput-boolean v0, p0, Ll/֫᩶;->ۧ:Z

    .line 129
    iput p1, p0, Ll/֫᩶;->ܽ:I

    return-void

    .line 130
    :cond_0
    iget v0, p0, Ll/֫᩶;->ܽ:I

    if-ne v0, p1, :cond_1

    return-void

    .line 131
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Given job ID "

    const-string v2, " is different than previous "

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 131
    iget v1, p0, Ll/֫᩶;->ܽ:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract ֫(Landroid/content/Intent;)V
.end method

.method public ۧ()V
    .locals 0

    return-void
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method
