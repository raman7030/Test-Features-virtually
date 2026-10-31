.class public final synthetic Ll/ۜۤ᩻;
.super Ljava/lang/Object;
.source "M6WW"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/ܰۢۜ;

.field public final synthetic ᩸:Ll/ܶۤ᩻;

.field public final synthetic ᩹:[I


# direct methods
.method public synthetic constructor <init>(Ll/ܶۤ᩻;[ILl/ܰۢۜ;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۤ᩻;->᩸:Ll/ܶۤ᩻;

    iput-object p2, p0, Ll/ۜۤ᩻;->᩹:[I

    iput-object p3, p0, Ll/ۜۤ᩻;->᩶:Ll/ܰۢۜ;

    iput-object p4, p0, Ll/ۜۤ᩻;->ۙ:Ljava/lang/String;

    iput-boolean p5, p0, Ll/ۜۤ᩻;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 0
    iget-object p1, p0, Ll/ۜۤ᩻;->ۙ:Ljava/lang/String;

    iget-boolean p2, p0, Ll/ۜۤ᩻;->ۗ:Z

    iget-object v0, p0, Ll/ۜۤ᩻;->᩸:Ll/ܶۤ᩻;

    iget-object v1, p0, Ll/ۜۤ᩻;->᩹:[I

    iget-object v2, p0, Ll/ۜۤ᩻;->᩶:Ll/ܰۢۜ;

    invoke-static {v0, v1, v2, p1, p2}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;[ILl/ܰۢۜ;Ljava/lang/String;Z)V

    return-void
.end method
