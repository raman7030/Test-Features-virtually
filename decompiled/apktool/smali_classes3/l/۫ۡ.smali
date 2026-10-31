.class public final Ll/۫ۡ;
.super Ljava/lang/Object;
.source "T22W"


# instance fields
.field public ֫:Landroid/view/textclassifier/TextClassifier;

.field public ۧ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/۫ۡ;->ۧ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/view/textclassifier/TextClassifier;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/۫ۡ;->֫:Landroid/view/textclassifier/TextClassifier;

    if-nez v0, :cond_0

    .line 64
    iget-object v0, p0, Ll/۫ۡ;->ۧ:Landroid/widget/TextView;

    invoke-static {v0}, Ll/۬ۡ;->֫(Landroid/widget/TextView;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ֫(Landroid/view/textclassifier/TextClassifier;)V
    .locals 0

    .line 52
    iput-object p1, p0, Ll/۫ۡ;->֫:Landroid/view/textclassifier/TextClassifier;

    return-void
.end method
