.class public final Ll/ۨ᩸ۜ;
.super Ljava/lang/Object;
.source "O8UQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Landroid/widget/TextView;)V
    .locals 0

    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ᩸ۜ;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۨ᩸ۜ;->᩹:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 238
    iget-object v0, p0, Ll/ۨ᩸ۜ;->᩸:Ll/ۗܺ᩷;

    iget-object v1, p0, Ll/ۨ᩸ۜ;->᩹:Landroid/widget/TextView;

    invoke-static {v0, v1}, Ll/ᩳ᩹ۜ;->֫(Ll/ۗܺ᩷;Landroid/widget/TextView;)V

    .line 239
    invoke-static {p0}, Ll/ᩳ᩹ۜ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
