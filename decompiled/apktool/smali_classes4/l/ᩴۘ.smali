.class public final Ll/ᩴۘ;
.super Ljava/lang/Object;
.source "N5JQ"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ᩸:Ll/᩹ۘ;


# direct methods
.method public constructor <init>(Ll/᩹ۘ;)V
    .locals 0

    .line 1435
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۘ;->᩸:Ll/᩹ۘ;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1443
    iget-object p1, p0, Ll/ᩴۘ;->᩸:Ll/᩹ۘ;

    .line 1460
    iget-object p1, p1, Ll/᩹ۘ;->ܿ֫:Ll/ܶۘ;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    const/4 p1, 0x0

    .line 1461
    throw p1
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
