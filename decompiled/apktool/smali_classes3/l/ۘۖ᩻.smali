.class public final Ll/ۘۖ᩻;
.super Ll/ۢۖ᩻;
.source "H88G"


# instance fields
.field public final synthetic ֫:Ll/ᩴۖ᩻;

.field public final synthetic ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ᩴۖ᩻;Ljava/lang/String;)V
    .locals 0

    .line 433
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 362
    iput-object p1, p0, Ll/ۘۖ᩻;->֫:Ll/ᩴۖ᩻;

    iput-object p2, p0, Ll/ۘۖ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 4

    .line 365
    new-instance v0, Ll/֨ۖ᩻;

    iget-object v1, p0, Ll/ۘۖ᩻;->֫:Ll/ᩴۖ᩻;

    iget-object v2, v1, Ll/ᩴۖ᩻;->ܽ֫:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Ll/ᩴۖ᩻;->ᩳ֫:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Ll/ۘۖ᩻;->ۧ:Ljava/lang/String;

    invoke-direct {v0, v3, v2, v1}, Ll/֨ۖ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/֨ۖ᩻;->֫()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
