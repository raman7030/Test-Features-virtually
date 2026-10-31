.class public final Ll/᩸᩵ۚ;
.super Ljava/lang/Object;
.source "M4K9"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩸:Ll/᩶᩵ۚ;

.field public final synthetic ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ll/᩶᩵ۚ;Ljava/util/Iterator;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩵ۚ;->᩸:Ll/᩶᩵ۚ;

    iput-object p2, p0, Ll/᩸᩵ۚ;->᩹:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 78
    iget-object v0, p0, Ll/᩸᩵ۚ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 83
    iget-object v0, p0, Ll/᩸᩵ۚ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll/᩸᩵ۚ;->᩸:Ll/᩶᩵ۚ;

    invoke-virtual {v1, v0}, Ll/᩶᩵ۚ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 88
    iget-object v0, p0, Ll/᩸᩵ۚ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method
