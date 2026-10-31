.class public final Ll/ۙ᩶֡;
.super Ll/֡ۙ֡;
.source "85A3"


# instance fields
.field public final synthetic ܳ:Ll/ۗ᩶֡;


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;Ll/ۗ᩶֡;Ll/ܶۙ֡;)V
    .locals 0

    .line 958
    iput-object p1, p0, Ll/ۙ᩶֡;->ܳ:Ll/ۗ᩶֡;

    .line 45
    invoke-direct {p0, p2, p3}, Ll/ۤۙ֡;-><init>(Ll/ۗ᩶֡;Ll/ܶۙ֡;)V

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 2

    .line 961
    iget-object v0, p0, Ll/ۙ᩶֡;->ܳ:Ll/ۗ᩶֡;

    invoke-static {v0}, Ll/ۗ᩶֡;->֫(Ll/ۗ᩶֡;)Ll/ۗ᩶֡;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    new-instance v0, Ll/֫᩸֡;

    invoke-direct {v0, p0}, Ll/֫᩸֡;-><init>(Ll/֡ۙ֡;)V

    .line 333
    invoke-virtual {v0, p1}, Ll/֫᩸֡;->֫(I)I

    move-result p1

    .line 967
    new-instance v0, Ll/᩶᩶֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v0, 0x0

    .line 974
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ᩸֡;

    .line 202
    iget v0, v0, Ll/ۚۙ֡;->᩶:I

    .line 974
    iput v0, p0, Ll/ۤۙ֡;->ᩳ:I

    return p1
.end method
