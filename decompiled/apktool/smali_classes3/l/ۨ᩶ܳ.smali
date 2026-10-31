.class public final synthetic Ll/ۨ᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܰ᩶ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܰ᩶ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ᩶ܳ;->᩸:Ll/ܰ᩶ܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 603
    new-instance v0, Ll/᩺᩶ܳ;

    iget-object v1, p0, Ll/ۨ᩶ܳ;->᩸:Ll/ܰ᩶ܳ;

    invoke-direct {v0, v1}, Ll/᩺᩶ܳ;-><init>(Ll/ܰ᩶ܳ;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
