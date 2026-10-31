.class public final Ll/᩵۟ܺ;
.super Ljava/lang/Object;
.source "O7R4"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput p1, p0, Ll/᩵۟ܺ;->ۧ:I

    .line 41
    iput p2, p0, Ll/᩵۟ܺ;->֫:I

    .line 42
    iput-object p3, p0, Ll/᩵۟ܺ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(IILjava/lang/String;)Ll/᩵۟ܺ;
    .locals 2

    const/4 v0, 0x0

    if-ltz p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 33
    :goto_0
    invoke-static {v1}, Ll/ۘܶܺ;->֫(Z)V

    if-ltz p1, :cond_1

    const/4 v0, 0x1

    .line 34
    :cond_1
    invoke-static {v0}, Ll/ۘܶܺ;->֫(Z)V

    .line 902
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    new-instance v0, Ll/᩵۟ܺ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩵۟ܺ;-><init>(IILjava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩵۟ܺ;
    .locals 2

    .line 29
    new-instance v0, Ll/᩵۟ܺ;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1, p0}, Ll/᩵۟ܺ;-><init>(IILjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x3a

    .line 71
    iget v2, p0, Ll/᩵۟ܺ;->ۧ:I

    if-ltz v2, :cond_0

    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    :cond_0
    iget v3, p0, Ll/᩵۟ܺ;->֫:I

    if-ltz v3, :cond_1

    .line 75
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    if-gez v2, :cond_2

    if-ltz v3, :cond_3

    :cond_2
    const/16 v1, 0x20

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    const-string v1, "error: "

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵۟ܺ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
