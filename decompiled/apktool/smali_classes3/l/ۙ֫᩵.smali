.class public final synthetic Ll/ۙ֫᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:Ljava/lang/CharSequence;

.field public final synthetic b:Ljava/lang/CharSequence;

.field public final synthetic c:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ֫᩵;->a:Ljava/lang/CharSequence;

    iput-object p2, p0, Ll/ۙ֫᩵;->b:Ljava/lang/CharSequence;

    iput-object p3, p0, Ll/ۙ֫᩵;->c:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ll/ۙ֫᩵;->a:Ljava/lang/CharSequence;

    iget-object v1, p0, Ll/ۙ֫᩵;->b:Ljava/lang/CharSequence;

    iget-object v2, p0, Ll/ۙ֫᩵;->c:Ljava/lang/CharSequence;

    sget-object v3, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 403
    new-instance v3, Ll/᩶۫ᩴ;

    invoke-direct {v3, v0, v1, v2}, Ll/᩶۫ᩴ;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-object v3
.end method
