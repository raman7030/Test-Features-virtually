.class public final synthetic Ll/ۗۙ᩷;
.super Ljava/lang/Object;
.source "8AHX"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:Landroid/content/SharedPreferences;

.field public final synthetic ᩸:Ll/ۛۙ᩷;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۙ᩷;Ll/ۗܺ᩷;Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۙ᩷;->᩸:Ll/ۛۙ᩷;

    iput-object p2, p0, Ll/ۗۙ᩷;->᩹:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ۗۙ᩷;->᩶:Landroid/content/SharedPreferences;

    iput-object p4, p0, Ll/ۗۙ᩷;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 0
    iget-object p1, p0, Ll/ۗۙ᩷;->᩶:Landroid/content/SharedPreferences;

    iget-object v0, p0, Ll/ۗۙ᩷;->ۙ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۗۙ᩷;->᩸:Ll/ۛۙ᩷;

    iget-object v2, p0, Ll/ۗۙ᩷;->᩹:Ll/ۗܺ᩷;

    invoke-static {v1, v2, p1, v0}, Ll/ۛۙ᩷;->֫(Ll/ۛۙ᩷;Ll/ۗܺ᩷;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-void
.end method
