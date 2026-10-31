.class public final Ll/ۤܶۚ;
.super Ljava/lang/Object;
.source "A18X"

# interfaces
.implements Ll/ۡ᩹ۚ;


# instance fields
.field public final ᩶:Ll/᩶֡ۚ;

.field public final ᩸:Ll/֫᩸ۚ;

.field public final ᩹:Ll/᩷᩹ۚ;


# direct methods
.method public constructor <init>(Ll/᩶֡ۚ;Ll/֫᩸ۚ;Ll/᩷᩹ۚ;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۤܶۚ;->᩶:Ll/᩶֡ۚ;

    .line 39
    iput-object p2, p0, Ll/ۤܶۚ;->᩸:Ll/֫᩸ۚ;

    .line 40
    iput-object p3, p0, Ll/ۤܶۚ;->᩹:Ll/᩷᩹ۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ֡ۚ;I)V
    .locals 0

    return-void
.end method

.method public final ۧ(Ll/ۨ֡ۚ;I)V
    .locals 1

    .line 44
    instance-of p2, p1, Ll/᩶֡ۚ;

    if-eqz p2, :cond_0

    .line 45
    check-cast p1, Ll/᩶֡ۚ;

    .line 46
    iget-object p2, p0, Ll/ۤܶۚ;->᩹:Ll/᩷᩹ۚ;

    iget-object v0, p0, Ll/ۤܶۚ;->᩶:Ll/᩶֡ۚ;

    invoke-virtual {p2, v0, p1}, Ll/᩷᩹ۚ;->֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 47
    iget-object p2, p0, Ll/ۤܶۚ;->᩸:Ll/֫᩸ۚ;

    invoke-virtual {p2, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
