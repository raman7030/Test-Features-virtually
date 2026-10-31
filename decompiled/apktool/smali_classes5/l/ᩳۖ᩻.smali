.class public final Ll/ᩳۖ᩻;
.super Ll/ۢۖ᩻;
.source "H88G"


# instance fields
.field public final synthetic ֫:Ll/ۚۖ᩻;

.field public final synthetic ۧ:Landroid/widget/EditText;

.field public final synthetic ܽ:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Ll/ۚۖ᩻;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .line 433
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Ll/ᩳۖ᩻;->֫:Ll/ۚۖ᩻;

    iput-object p2, p0, Ll/ᩳۖ᩻;->ۧ:Landroid/widget/EditText;

    iput-object p3, p0, Ll/ᩳۖ᩻;->ܽ:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 3

    .line 75
    iget-object v0, p0, Ll/ᩳۖ᩻;->ۧ:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳۖ᩻;->ܽ:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ᩳۖ᩻;->֫:Ll/ۚۖ᩻;

    invoke-virtual {v2, v0, v1}, Ll/ۚۖ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
