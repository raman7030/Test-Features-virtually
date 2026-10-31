.class public final synthetic Ll/᩵۟ܿ;
.super Ljava/lang/Object;
.source "X4M8"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/CharSequence;

.field public final synthetic ᩸:Ll/ۜܰܿ;

.field public final synthetic ᩹:Ll/۬۟ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۜܰܿ;Ll/۬۟ܿ;Ljava/lang/CharSequence;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵۟ܿ;->᩸:Ll/ۜܰܿ;

    iput-object p2, p0, Ll/᩵۟ܿ;->᩹:Ll/۬۟ܿ;

    iput-object p3, p0, Ll/᩵۟ܿ;->᩶:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    const-string p1, "editView"

    .line 56
    iget-object v1, p0, Ll/᩵۟ܿ;->᩸:Ll/ۜܰܿ;

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string p1, "text"

    .line 58
    iget-object v6, p0, Ll/᩵۟ܿ;->᩶:Ljava/lang/CharSequence;

    invoke-static {v6, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 59
    iget-object v3, p0, Ll/᩵۟ܿ;->᩹:Ll/۬۟ܿ;

    invoke-virtual {v3, v1}, Ll/۬۟ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 63
    :cond_0
    new-instance v2, Ll/᩹۟ܿ;

    .line 670
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v5, Ll/۫۟ܿ;

    invoke-direct {v5, v1, v3}, Ll/۫۟ܿ;-><init>(Ll/ۜܰܿ;Ll/۬۟ܿ;)V

    .line 66
    new-instance p1, Ll/֡۟ܿ;

    invoke-direct {p1, v2}, Ll/֡۟ܿ;-><init>(Ll/᩹۟ܿ;)V

    new-instance v0, Ll/ۚ۟ܿ;

    invoke-direct {v0, v5}, Ll/ۚ۟ܿ;-><init>(Ll/۫۟ܿ;)V

    .line 65
    invoke-virtual {v1, p1, v0}, Ll/ۜܰܿ;->֫(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ll/ܽܰܿ;

    move-result-object v4

    if-nez v4, :cond_1

    const p1, 0x7f1207a7

    .line 68
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 71
    :cond_1
    invoke-virtual {v3, v1}, Ll/۬۟ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 72
    invoke-virtual {v4}, Ll/ܽܰܿ;->close()V

    return-void

    .line 76
    :cond_2
    new-instance p1, Ll/᩸۟ܿ;

    move-object v0, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Ll/᩸۟ܿ;-><init>(Ll/ۜܰܿ;Ll/᩹۟ܿ;Ll/۬۟ܿ;Ll/ܽܰܿ;Ll/۫۟ܿ;Ljava/lang/CharSequence;I)V

    .line 137
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
