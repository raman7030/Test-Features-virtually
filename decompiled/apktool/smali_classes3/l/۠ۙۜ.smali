.class public final synthetic Ll/۠ۙۜ;
.super Ljava/lang/Object;
.source "Q6ZJ"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۙۙۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ۙۙۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۙۜ;->᩸:Ll/ۙۙۜ;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    const-string p1, "User-Agent"

    const-string v0, "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36"

    .line 80
    iget-object v1, p0, Ll/۠ۙۜ;->᩸:Ll/ۙۙۜ;

    invoke-virtual {v1, p1, v0}, Ll/ۙۙۜ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
