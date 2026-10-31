.class public final Ll/᩹ܰܳ;
.super Ljava/lang/Object;
.source "D1K5"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/widget/Spinner;

.field public final synthetic ᩶:Ll/ۖۢܳ;

.field public final synthetic ᩸:Ll/ۗۘ;

.field public final synthetic ᩹:Ll/ۗۘ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9d

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/widget/Spinner;Ll/ۖۢܳ;Ll/ۗۘ;Ll/ۗۘ;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ܰܳ;->ۙ:Landroid/widget/Spinner;

    iput-object p2, p0, Ll/᩹ܰܳ;->᩶:Ll/ۖۢܳ;

    iput-object p3, p0, Ll/᩹ܰܳ;->᩸:Ll/ۗۘ;

    iput-object p4, p0, Ll/᩹ܰܳ;->᩹:Ll/ۗۘ;

    return-void
.end method


# virtual methods
.method public native onClick(Landroid/content/DialogInterface;I)V
.end method
