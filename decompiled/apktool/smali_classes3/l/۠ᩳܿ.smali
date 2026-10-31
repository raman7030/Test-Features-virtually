.class public final synthetic Ll/۠ᩳܿ;
.super Ljava/lang/Object;
.source "N7PP"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/ۤۤᩳ;

.field public final synthetic ᩹:Ll/ۤۤᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۤᩳ;Ll/ۤۤᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ᩳܿ;->᩸:Ll/ۤۤᩳ;

    iput-object p2, p0, Ll/۠ᩳܿ;->᩹:Ll/ۤۤᩳ;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    const-string v0, "INTERNAL:Regex"

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 2070
    :goto_0
    iget-object v1, p0, Ll/۠ᩳܿ;->᩸:Ll/ۤۤᩳ;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Ll/۫ۨᩳ;->֫(Ljava/lang/String;Z)V

    if-eqz p2, :cond_1

    const-string p1, "INTERNAL:RegexReplacement"

    :cond_1
    iget-object p2, p0, Ll/۠ᩳܿ;->᩹:Ll/ۤۤᩳ;

    invoke-virtual {p2, p1, v2}, Ll/۫ۨᩳ;->֫(Ljava/lang/String;Z)V

    return-void
.end method
