.class public final synthetic Ll/ۧۧ᩻;
.super Ljava/lang/Object;
.source "Q98G"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/ܽۧ᩻;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۧ᩻;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۧ᩻;->᩸:Ll/ܽۧ᩻;

    iput-object p2, p0, Ll/ۧۧ᩻;->᩹:Ljava/lang/String;

    iput-object p3, p0, Ll/ۧۧ᩻;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 0
    iget-object p1, p0, Ll/ۧۧ᩻;->᩹:Ljava/lang/String;

    iget-object v0, p0, Ll/ۧۧ᩻;->᩶:Ljava/lang/String;

    iget-object v1, p0, Ll/ۧۧ᩻;->᩸:Ll/ܽۧ᩻;

    invoke-static {v1, p1, v0, p2}, Ll/ܽۧ᩻;->֫(Ll/ܽۧ᩻;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
