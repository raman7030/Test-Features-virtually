.class public final Ll/ۚ᩶֡;
.super Ll/ᩴ᩶֡;
.source "F5QL"


# instance fields
.field public final synthetic ֫:Ll/᩸᩶֡;

.field public final synthetic ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩸᩶֡;Ljava/util/ArrayList;)V
    .locals 0

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p1, p0, Ll/ۚ᩶֡;->֫:Ll/᩸᩶֡;

    iput-object p2, p0, Ll/ۚ᩶֡;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 147
    iget-object v0, p0, Ll/ۚ᩶֡;->֫:Ll/᩸᩶֡;

    iget-object v0, v0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    iget-object v0, v0, Ll/ۗ᩶֡;->᩵:Ll/֡ۙ֡;

    invoke-virtual {v0, p1}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    iget-object v0, p0, Ll/ۚ᩶֡;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ֫(IIIIZ)V
    .locals 2

    .line 133
    iget-object p1, p0, Ll/ۚ᩶֡;->֫:Ll/᩸᩶֡;

    iget-object p1, p1, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    iget-object p5, p0, Ll/ۚ᩶֡;->ۧ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 134
    iget-object v1, p1, Ll/ۗ᩶֡;->᩵:Ll/֡ۙ֡;

    invoke-virtual {v1, p2}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p2

    invoke-virtual {p5, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eq p3, v0, :cond_1

    .line 137
    iget-object p2, p1, Ll/ۗ᩶֡;->֡:Ll/֡ۙ֡;

    invoke-virtual {p2, p3}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p2

    invoke-virtual {p5, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eq p4, v0, :cond_2

    .line 140
    iget-object p1, p1, Ll/ۗ᩶֡;->᩵:Ll/֡ۙ֡;

    invoke-virtual {p1, p4}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final ֫(IIIZ)V
    .locals 2

    .line 121
    iget-object p1, p0, Ll/ۚ᩶֡;->֫:Ll/᩸᩶֡;

    iget-object p1, p1, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    iget-object p4, p0, Ll/ۚ᩶֡;->ۧ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 122
    iget-object v1, p1, Ll/ۗ᩶֡;->᩵:Ll/֡ۙ֡;

    invoke-virtual {v1, p2}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eq p3, v0, :cond_1

    .line 125
    iget-object p1, p1, Ll/ۗ᩶֡;->֡:Ll/֡ۙ֡;

    invoke-virtual {p1, p3}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
