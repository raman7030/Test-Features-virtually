.class public final synthetic Ll/ܽ۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/ۗܺ᩷;

.field public final synthetic ᩶:Landroid/widget/EditText;

.field public final synthetic ᩸:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩹:Ll/۫۬᩻;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Ll/۫۬᩻;Landroid/widget/EditText;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ۫᩻;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Ll/ܽ۫᩻;->᩹:Ll/۫۬᩻;

    iput-object p3, p0, Ll/ܽ۫᩻;->᩶:Landroid/widget/EditText;

    iput-object p4, p0, Ll/ܽ۫᩻;->ۙ:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 0
    iget-object p1, p0, Ll/ܽ۫᩻;->᩶:Landroid/widget/EditText;

    iget-object v0, p0, Ll/ܽ۫᩻;->ۙ:Ll/ۗܺ᩷;

    iget-object v1, p0, Ll/ܽ۫᩻;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, p0, Ll/ܽ۫᩻;->᩹:Ll/۫۬᩻;

    invoke-static {v1, v2, p1, v0}, Ll/ܿۤ᩻;->֫(Lcom/google/android/material/textfield/TextInputLayout;Ll/۫۬᩻;Landroid/widget/EditText;Ll/ۗܺ᩷;)V

    return-void
.end method
