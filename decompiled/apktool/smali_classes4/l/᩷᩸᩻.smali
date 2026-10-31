.class public final synthetic Ll/᩷᩸᩻;
.super Ljava/lang/Object;
.source "X8F2"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۢ᩸᩻;

.field public final synthetic ᩹:Ll/ܽۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢ᩸᩻;Ll/ܽۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷᩸᩻;->᩸:Ll/ۢ᩸᩻;

    iput-object p2, p0, Ll/᩷᩸᩻;->᩹:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 389
    iget-object v0, p0, Ll/᩷᩸᩻;->᩸:Ll/ۢ᩸᩻;

    iget-object v1, v0, Ll/ۢ᩸᩻;->ܿ:Ll/ۡ᩸᩻;

    iget v0, v0, Ll/ۢ᩸᩻;->ᩳ:I

    if-eq v0, p2, :cond_1

    if-nez p2, :cond_0

    .line 391
    invoke-static {v1}, Ll/ۡ᩸᩻;->֫(Ll/ۡ᩸᩻;)Ll/ܿ᩸᩻;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ll/ܿ᩸᩻;->ᩳ(Ljava/lang/String;)V

    .line 392
    invoke-static {}, Ll/ۡ᩸᩻;->᩻֫()Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {v1}, Ll/ۡ᩸᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 394
    invoke-static {p2}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object p2

    .line 395
    invoke-static {v1}, Ll/ۡ᩸᩻;->֫(Ll/ۡ᩸᩻;)Ll/ܿ᩸᩻;

    move-result-object v0

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܿ᩸᩻;->ᩳ(Ljava/lang/String;)V

    .line 396
    invoke-static {}, Ll/ۡ᩸᩻;->᩻֫()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v1}, Ll/ۡ᩸᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    :goto_0
    iget-object p2, p0, Ll/᩷᩸᩻;->᩹:Ll/ܽۢܳ;

    invoke-virtual {p2}, Ll/ܽۢܳ;->ᩳ֫()V

    .line 400
    :cond_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
