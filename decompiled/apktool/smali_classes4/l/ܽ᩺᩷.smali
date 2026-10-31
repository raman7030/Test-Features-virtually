.class public final synthetic Ll/ܽ᩺᩷;
.super Ljava/lang/Object;
.source "P1EM"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Exception;

.field public final synthetic ᩸:Ll/ۡ᩺᩷;

.field public final synthetic ᩹:Ll/᩸ۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۡ᩺᩷;Ll/᩸ۛ᩷;Ljava/lang/Exception;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩺᩷;->᩸:Ll/ۡ᩺᩷;

    iput-object p2, p0, Ll/ܽ᩺᩷;->᩹:Ll/᩸ۛ᩷;

    iput-object p3, p0, Ll/ܽ᩺᩷;->᩶:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget-object v0, p0, Ll/ܽ᩺᩷;->᩶:Ljava/lang/Exception;

    .line 303
    iget-object v1, p0, Ll/ܽ᩺᩷;->᩹:Ll/᩸ۛ᩷;

    invoke-interface {v1}, Ll/᩸ۛ᩷;->ܽ()Ll/ܿۛ᩷;

    move-result-object v2

    iget-object v3, p0, Ll/ܽ᩺᩷;->᩸:Ll/ۡ᩺᩷;

    invoke-virtual {v3, v2, v0}, Ll/ۡ᩺᩷;->֫(Ll/ܿۛ᩷;Ljava/lang/Exception;)V

    .line 304
    invoke-interface {v1}, Ll/᩸ۛ᩷;->ۧ()V

    return-void
.end method
