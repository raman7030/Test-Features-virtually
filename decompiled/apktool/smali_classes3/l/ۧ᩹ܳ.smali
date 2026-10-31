.class public final synthetic Ll/ۧ᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:[Z


# direct methods
.method public synthetic constructor <init>(I[ZLjava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۧ᩹ܳ;->᩸:I

    iput-object p2, p0, Ll/ۧ᩹ܳ;->᩹:[Z

    iput-object p3, p0, Ll/ۧ᩹ܳ;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 0
    iget-object p1, p0, Ll/ۧ᩹ܳ;->᩹:[Z

    iget-object p2, p0, Ll/ۧ᩹ܳ;->᩶:Ljava/util/ArrayList;

    iget v0, p0, Ll/ۧ᩹ܳ;->᩸:I

    invoke-static {v0, p1, p2}, Ll/ܽ᩶ܳ;->֫(I[ZLjava/util/ArrayList;)V

    return-void
.end method
