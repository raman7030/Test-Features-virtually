.class public final synthetic Ll/᩵֫ۖ;
.super Ljava/lang/Object;
.source "C7NK"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/֡֫ۖ;

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ll/֡֫ۖ;Ljava/util/ArrayList;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵֫ۖ;->᩸:Ll/֡֫ۖ;

    iput-object p2, p0, Ll/᩵֫ۖ;->᩹:Ljava/util/ArrayList;

    iput p3, p0, Ll/᩵֫ۖ;->᩶:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Ll/᩵֫ۖ;->᩹:Ljava/util/ArrayList;

    iget v1, p0, Ll/᩵֫ۖ;->᩶:I

    iget-object v2, p0, Ll/᩵֫ۖ;->᩸:Ll/֡֫ۖ;

    invoke-static {v2, v0, v1}, Ll/֡֫ۖ;->֫(Ll/֡֫ۖ;Ljava/util/ArrayList;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
