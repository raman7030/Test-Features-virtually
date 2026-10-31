.class public final Ll/ܿ᩵֡;
.super Ljava/lang/Object;
.source "0907"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Ll/ܿ᩵֡;->֫:I

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ܿ᩵֡;->ۧ:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ܿ᩵֡;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 2

    .line 18
    iget v0, p0, Ll/ܿ᩵֡;->֫:I

    iget-object v1, p0, Ll/ܿ᩵֡;->ۧ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const/16 v0, 0xa

    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 22
    iget p1, p0, Ll/ܿ᩵֡;->֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܿ᩵֡;->֫:I

    return-void
.end method
