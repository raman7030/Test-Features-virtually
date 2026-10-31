.class public final synthetic Ll/۬ۤܿ;
.super Ljava/lang/Object;
.source "I4HH"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩺ۤܿ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/᩺ۤܿ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۤܿ;->᩸:Ll/᩺ۤܿ;

    iput-boolean p2, p0, Ll/۬ۤܿ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-boolean v0, p0, Ll/۬ۤܿ;->᩹:Z

    .line 198
    iget-object v1, p0, Ll/۬ۤܿ;->᩸:Ll/᩺ۤܿ;

    iget-object v1, v1, Ll/᩺ۤܿ;->ۜ:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    return-void
.end method
