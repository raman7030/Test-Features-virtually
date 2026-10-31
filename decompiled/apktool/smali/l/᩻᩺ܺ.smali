.class public Ll/᩻᩺ܺ;
.super Ll/᩷᩺ܺ;
.source "D3VQ"


# static fields
.field public static final ۧ:Ll/ۗܶܺ;


# instance fields
.field public final ֫:Ljava/lang/CharSequence;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 544
    invoke-static {}, Ll/ۗܶܺ;->֫()Ll/ۗܶܺ;

    move-result-object v0

    sput-object v0, Ll/᩻᩺ܺ;->ۧ:Ll/ۗܶܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    iput-object p1, p0, Ll/᩻᩺ܺ;->֫:Ljava/lang/CharSequence;

    return-void
.end method

.method public static synthetic ܽ()Ll/ۗܶܺ;
    .locals 1

    .line 542
    sget-object v0, Ll/᩻᩺ܺ;->ۧ:Ll/ۗܶܺ;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 631
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CharSource.wrap("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 902
    iget-object v1, p0, Ll/᩻᩺ܺ;->֫:Ljava/lang/CharSequence;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/16 v3, 0x1e

    if-gt v2, v3, :cond_0

    .line 565
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 566
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-gt v2, v3, :cond_0

    goto :goto_0

    .line 573
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x0

    const/16 v4, 0x1b

    .line 574
    invoke-virtual {v2, v1, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    const-string v1, "..."

    .line 575
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, ")"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 559
    iget-object v0, p0, Ll/᩻᩺ܺ;->֫:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ܳ۬ܺ;
    .locals 1

    .line 582
    new-instance v0, Ll/ܳ᩺ܺ;

    invoke-direct {v0, p0}, Ll/ܳ᩺ܺ;-><init>(Ll/᩻᩺ܺ;)V

    .line 614
    invoke-static {v0}, Ll/ܳ۬ܺ;->֫(Ljava/util/Iterator;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method
