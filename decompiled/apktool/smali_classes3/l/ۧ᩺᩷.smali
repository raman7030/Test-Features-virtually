.class public final synthetic Ll/ۧ᩺᩷;
.super Ljava/lang/Object;
.source "P1EM"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ll/ۙۛ᩷;

.field public final synthetic ᩹:Ll/᩶ۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۙۛ᩷;Ll/᩶ۛ᩷;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩺᩷;->᩸:Ll/ۙۛ᩷;

    iput-object p2, p0, Ll/ۧ᩺᩷;->᩹:Ll/᩶ۛ᩷;

    iput-object p3, p0, Ll/ۧ᩺᩷;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 281
    iget-object v0, p0, Ll/ۧ᩺᩷;->᩸:Ll/ۙۛ᩷;

    invoke-interface {v0}, Ll/ۙۛ᩷;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 282
    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    .line 284
    :cond_0
    iget-object v1, p0, Ll/ۧ᩺᩷;->᩹:Ll/᩶ۛ᩷;

    check-cast v1, Ll/᩷᩺᩷;

    iget-object v2, p0, Ll/ۧ᩺᩷;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ll/᩷᩺᩷;->֫(Ljava/util/ArrayList;)Ll/֨ۛ᩷;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ۙۛ᩷;->֫(Ll/֨ۛ᩷;)V

    .line 285
    invoke-interface {v0}, Ll/ۙۛ᩷;->ۧ()V

    return-void
.end method
